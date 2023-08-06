from itertools import permutations
class Solution:
    def permutation(self,s):
        s=list(permutations(s))
        s=sorted(s)
        a=[]
        b=""
        for i in range(len(s)):
            a.append(b.join(s[i]))
            b=""
        return a 
 
