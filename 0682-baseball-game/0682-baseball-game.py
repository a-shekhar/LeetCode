class Solution:
    def calPoints(self, ops: List[str]) -> int:
        lst = list()
        for ope in ops:
            if ope.isdigit():
                lst.append(int(ope))
            elif ope == "+":
                temp = int(lst[-1]) + int(lst[-2])
                lst.append(temp)
            elif ope == "D":
                temp = int(lst[-1]) * 2
                lst.append(temp)
            elif ope == "C":
                temp = lst[-1]
                lst.remove(temp)
        return(sum(lst[0:]))
        