class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:


        words=s.split(' ')
        if len(words) !=len(pattern):
            return False
    
        char_to_word={}


        for char,word in zip(pattern,words):
            if char not in char_to_word:
                if word in char_to_word.values():
                    return False
                char_to_word[char]=word
        


            elif char_to_word[char]!=word:
                return False    


        return True

            