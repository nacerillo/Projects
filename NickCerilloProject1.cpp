#include <iostream> 
#include <stack> 
#include <string>
#include <queue>
#include <sstream>
#include <ostream>
#include <math.h>
#include <unordered_map>
using namespace std; 



bool isOperator(char op)
{
	switch(op) {
		case '+':
		case '-':
		case '/':
		case '*':
		case '^':
		return true;

		default:
			return false;
	}

}

bool precedence(char left, char right) 
{
	    if(left == '^') {
            return true;
        } else if(right == '^') {
            return false;
        } else if((left == '*')  || (left == '/')) {
            return true;
        } else if((right == '*') || (right == '/')) {
            return false;
        }
        return true;
}


//converting an expression into a postfix that can be tokenized
string  Shuntingyard(string input) 
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
		

			

		if(isdigit(input[i]) || input[i] == '.' )
		{
		  // result += " ";
		   result += input[i]; 
		   
		}
		if(isalpha(input[i])){
			result += input[i];
		}
		if(input[i] == '='){
            result += input[i];
			result += " ";
            
		}

	

		if(isOperator(input[i]))
		{
				result += " ";

			while(!operate.empty() && precedence(operate.top(), input[i]) && isOperator(operate.top()))
			{
				result += " ";
				result += operate.top();				
				operate.pop();
			}
			result += " ";
			operate.push(input[i]);
		}

		if(input[i] == '(') 
		{
			operate.push(input[i]);
		}

		if(input[i] == ')')
		{
				while(operate.top() != '('){
			    result += " "; 
				result += operate.top();
				operate.pop(); 
			}
			operate.pop();
			}
				
		}

		while(!operate.empty()){
			if(operate.top() != '(')
			{
				result += " "; 
				result += operate.top();
				operate.pop(); 
			}
			else(operate.pop());
		     }

			return result;	
}


vector<string> tokenize(string result) 
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
double Arithmatic(vector <string> token)
{
	string final;
	stack <double> calcStack;

	double operand;
	double op1, op2;
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

		
		if(token.at(i) == "+" || token.at(i) == "-" || token.at(i) == "/" || token.at(i) == "*" || token.at(i) == "^" )
		{
				
				op1 = calcStack.top();
				calcStack.pop();
				op2 = calcStack.top();
				calcStack.pop();

			if(token.at(i) == "+")
			{
			
				calcStack.push(op1 + op2);				
			}

			if(token.at(i) == "/")
			{
				if(op1 == 0){
					throw overflow_error("Divide-By-Zero");
				}
				else{
				calcStack.push(op2 / op1);
					}
			}

			if(token.at(i) == "*")
			{
				calcStack.push(op2 * op1);
			}

			if(token.at(i) == "-"){
				calcStack.push(op2 - op1);
			}

			if(token.at(i) == "^"){
				calcStack.push(pow(op2, op1));
			}

		}
			
}
 		return calcStack.top();

}

vector <string> ReplaceVariable(unordered_map<string, double> v, vector <string> s)
{

         vector <string> replaced;
         
         
        			 for(int x = 0; x < s.size(); x++)
             		{
             			if(v.size() != 0)
             			{
             				unordered_map<string,double>::iterator y = v.find (s[x]);
             				 if(isalpha(s.at(x)[0]))
             				 {

         					    if(y == v.end() )
                                {
          	 						throw overflow_error("Undefined Variable");
          					    }   
          					    else
         					    {
          							s[x] = to_string(y->second);
        				        }
        				     }
             		
             			}

             			else if(v.size() == 0)
             			{
             				if(isalpha(s.at(x)[0])) 
             				{
             					 throw overflow_error("Undefined Variable");
             				}
             			}

            		 }
         


  replaced = s;
  return replaced;
}

int main()
{
	bool assignment = false;
	bool reassignment = false;
	int err = 0;
	string  expression;
	string key;
	unordered_map<string, double> variable;
	string postfix;
    vector <string> vs;
    vector <string> rp;
    double value;
    double answer;
	while(getline(cin,expression))
   {
    try
   {
       	 	if(expression == "quit")
       	 	{
       		break;
       	    }
       postfix = Shuntingyard(expression);

       vs = tokenize(postfix);
       if((vs[0].find("let") != string::npos) && (vs[0].find("=") != string::npos))
	   {
	   	 assignment = true;
	     vs[0].erase(vs[0].find("let"), 3);
         vs[0].erase(vs[0].find("="),1);
         key = vs[0];
         vs.erase(vs.begin());
	   }
	   else{
	   	   assignment = false;
	       }

			cout << vs[0] << endl;
         	rp = ReplaceVariable(variable, vs);
            answer = Arithmatic(rp);
          
   

        if(assignment)
        {   	
          unordered_map<string,double>::iterator k = variable.find (key); 
          if(k == variable.end())
          {
          	variable.insert (pair<string,double>(key,answer)); 
          }   
          else
          {
          	k->second = answer;
          }
        		    
	    }
	    else
	    {
	    	
	    	cout << answer << endl;
	    }
	 
		
    }
        catch(overflow_error e) {
         cout << e.what() << endl;
           }
     

          

	
		
    }
		
      
	
};







