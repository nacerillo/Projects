#include <iostream> 
#include <stack> 
#include <string>
#include <queue>
#include <sstream>
#include <ostream>
#include <math.h>
#include "dice2.h"
using namespace std; 

//bool method used to check whether or not a character in the string is an operater
Dice::Dice(){
	srand(time(NULL));
}

bool Dice::isOperator(char op)
{
	switch(op) {
		case '+':
		case '-':
		case 'd':
	
		return true;

		default:
			return false;
	}
}

bool Dice::precedence(char left, char right) 
{
	    if(left == 'd') {
            return true;
        } else if(right == 'd') {
            return false;
        } else if((left == '+') || (left == '-')) {
            return true;
        } else if((right == '+') || (right == '-')) {
            return false;
        }
        return true;
}


//converting an expression into a postfix that can be tokenized
string  Dice::Shuntingyard(string input) 
{
	string result = "";
	stack <char> operate;
	int i;
	

	for (i = 0; i < input.length(); i++)
	{
			if(input[i] == ' ')
			{
				continue;
			}

			if(input[0] == ')') {
				throw runtime_error("Error: can't begin with closing parentheses!");
			}

		if(isalnum(input[i]) )
		{
			
		   result += input[i]; 
		   
		}

		if(isOperator(input[i]))
		{
				result += " ";

			while(!operate.empty() && precedence(operate.top(), input[i]) && isOperator(operate.top()))
			{
				result += operate.top();				
				operate.pop();
			}
			
			operate.push(input[i]);
		}

		if(input[i] == '(') 
		{
			operate.push(input[i]);
		}

		if(input[i] == ')')
		{
			
			while(!operate.empty() && (operate.top() != '('))
			{
				result += " "; 
				result += operate.top();
				operate.pop(); 
			}
				operate.pop();			
		}


	}		
			return result;	
}

//tokenizes the postfix expression
vector<string> Dice::tokenize(string result) 
{
        string buffer;

        stringstream ss(result);

        vector<string> tokens;

        while(ss >> buffer) 
        {
            tokens.push_back(buffer);
        }
 
        return tokens;
}
int Dice::Arithmatic(vector <string> token)
{
	
	string final;
	stack <int> calcStack;
	int dd;
	int operand;
	int op1, op2;
	int size = token.size();
	int n = 0;
	
	for(int i = 0; i < size; i++)
	{
		
		if(isdigit(token.at(i)[0]))
		{	
			stringstream ss;		
			ss << token.at(i);
			ss >> operand;
			
			calcStack.push(operand);
			
		}


			
		if(token.at(i) == "+" || token.at(i) == "-" || token.at(i) == "d")
		{
				
				op1 = calcStack.top();
				calcStack.pop();
				op2 = calcStack.top();
				calcStack.pop();

			if(token.at(i) == "+")
			{	
				calcStack.push(op2 + op1);
			}

			if(token.at(i) == "-"){
				calcStack.push(op2 - op1);
			}

			if(token.at(i) == "d"){

					int t = 0;
					for(int q = op1; q > 0; q--)
					{
					dd = ((rand() % op2) + 1);
					t += dd;
					}
				calcStack.push(t);
			}
		}
}
 		return calcStack.top();
}

int main()
{
	Dice game;
	string  expression;
	bool isRunning = true;
int l = 0;
int r = 0;
	getline(cin, expression);


for(int i=0;i<expression.length();i++){
	if(expression[i]=='(')
		l++;
	if(expression[i]==')')
		r++;	
	}
	bool equal = (l==r);
	
	if(equal == true) 
	{
		try {

		string bannana = game.Shuntingyard(expression); 
		vector <string> vs = game.tokenize(bannana);
		int answer = game.Arithmatic(vs);
		cout << answer << "\n";
		
		

		}

		catch(std::exception &e) {
		cout << e.what() << endl;
		}

	}

	
	

	
}
