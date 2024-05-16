P-Class Problems and NP-Class problems are two sorts of problems with one distinct difference: the amount of time it takes to solve one of them.

P problems are those that can be solved algorithmically in polynomial time. This means that the time it takes to find a solution can be expressed as a polynomial function of size n. 

Here are examples of P problems we've heard of to jog your memory:

Sorting algorithms like QuickSort and MergeSort, with their time complexity of 𝑂(𝑛log𝑛).
Searching algorithms like Linear Search can be completed in 𝑂(𝑛) time.
Tree traversal algorithms like Breadth-First Search (BFS) and Depth-First Search (DFS) can solve problems in 𝑂(𝑛) time.
O(n).

Basically, many of the problems we've solved in DSA are P problems. So what are NP-Class problems?

Nondeterministic polynomial time problems are those for which a given solution can be verified as correct in polynomial time, even if finding the solution might take longer. Examples from slides include:

Sudoku: For a 3x3 grid, the problem is easily brute-forced and solved. For a 9x9 grid, it becomes more challenging but still feasible within reasonable time for verification. For larger grids, like 1500x1500, solving it is impractical, but verifying a given solution is quick.

The million dollar question in computer science regarding P and NP is whether every problem whose solution can be quickly verified (NP) can also be quickly solved (P). 

Why do we care? The end result of the P vs NP problem has the following implications:

If P = NP:

Cryptographic systems relying on the difficulty of certain problems would be compromised.
Potentially, we could solve all sorts of complex problems efficiently.
The practicality of these solutions depends on finding efficient algorithms, not just polynomial ones, as some might be impractically high-degree polynomials.

If P ≠ NP:

We would accept that some problems cannot be solved quickly.
Research would focus on heuristic methods or partial solutions for these hard problems.
The majority consensus among computer scientists is that 𝑃 ≠ 𝑁𝑃.
