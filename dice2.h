#include <math.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <vector>
#include <cctype>
#include <stdexcept>
#include <sstream>
#include <stack>
#include <ctime>
#include <time.h>

using namespace std;
class Dice{
	private:
		char op;
		char left, right;
		string input;
		string result;
		vector<string> token; 

	public:
		Dice();
		bool isOperator(char op);
		bool precedence(char left, char right);
		string Shuntingyard(string input);
		vector<string> tokenize(string result);
		int Arithmatic(vector<string> token);
};

