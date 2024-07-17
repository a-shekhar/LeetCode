class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        R=len(grid)
        C=len(grid[0])
        perimeter=0
        for r in range(R):
            for c in range(C):
                if grid[r][c]:
                    perimeter+=4
                    if c-1>=0 and grid[r][c-1]:
                        perimeter-=2
                    if r-1>=0 and grid[r-1][c]:
                        perimeter-=2
        return perimeter

        