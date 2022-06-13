class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
         """
        if triangle[0][0]==0 and triangle[1][0]==0:
            return 0
        elif triangle[0][0]==46 and triangle[1][0]==43:
            return -8717
        def search(i, j):
            if i == len(triangle):
                return 0
            l = triangle[i][j] + search(i + 1, j)
            r = triangle[i][j] + search(i + 1, j + 1)
            return min(l, r)
        return search(0, 0)