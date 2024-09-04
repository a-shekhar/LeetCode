class Solution {
public:
    string reverseWords(string input) {
    std::string result ;
    std::string word;
    int n = input.length();
    bool firstword = true;
    for( int i = n-1 ; i>=0 ; i--)
    {
        if(input[i]!=' ')
        {
            word = input[i] + word;
        }
        else if(!word.empty())
        {
            if(!firstword)
            {
                result += " ";
            }
            result += word;
            word = "";
            firstword = false;
        }
    }
    if(!word.empty()){
        if(!firstword)
        {
            result += " ";
        }
        result += word;
    }
    return result;

    }
};