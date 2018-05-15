# https://leetcode.com/contest/weekly-contest-75/problems/all-paths-from-source-to-target/
class Solution:
    def allPathsSourceTarget(self, graph):
        """
        :type graph: List[List[int]]
        :rtype: List[List[int]]
        """
        all_path = []
        path = [0]
        all_path = self.findPath(graph, 0, path, all_path)

    def findPath(self, graph, x, path, all_path):
        for l in graph[x]:
            path.append(l)
            if l == len(graph) - 1:
                print(path)
                all_path.append(path)
                path = [0]
            else:
                self.findPath(graph, l, path, all_path)
                # print(all_path)


if __name__ == '__main__':
    graph = [[1, 2], [3], [3], []]
    Solution = Solution()
    Solution.allPathsSourceTarget(graph)
