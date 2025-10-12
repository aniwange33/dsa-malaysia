# dsa-malaysia
This will be my dsa journey as a Nigeria software engineer working and living in Malaysia
So help me God


# 🧩 Pattern Recognition in DSA

> A practical guide to identifying problem patterns — understanding what technique applies based on structure (subarray, subsequence, subset, etc.)

---

## 🧠 Core Pattern Summary

| **Problem Type** | **Core Pattern** | **Key Tools / Techniques** | **When to Use** |
|------------------|------------------|-----------------------------|-----------------|
| **Subarray** | 🔹 *Two Pointers / Sliding Window / Prefix Sum* | - Two pointers for dynamic ranges<br>- Sliding window for “at most / exactly / longest” type problems<br>- Prefix sum for cumulative metrics (sum, average, etc.) | When order **matters** and elements are **contiguous** |
| **Subsequence** | 🔹 *Dynamic Programming (DP)* + *Combinatorics* | - DP on indices (include/exclude)<br>- Sometimes memoization or bottom-up table<br>- Combinatorial math for counting subsequences | When order **matters** but elements **can skip** |
| **Subset** | 🔹 *Combinatorics / Bitmask DP / Backtracking* | - Bitmask enumeration<br>- DP with state compression<br>- Inclusion–exclusion principles | When order **does not matter** (sets of elements) |
| **Permutation** | 🔹 *Backtracking / Factorial patterns* | - Swap-based recursion<br>- Heap’s algorithm<br>- Used when **order matters** and **no duplicates** | When you must generate all possible **arrangements** |
| **Combination** | 🔹 *Backtracking + Pruning / Math C(n, k)* | - Recursion with index control<br>- Combinatorial math for counting | When choosing `k` elements out of `n`, **order doesn’t matter** |
| **String Problems** | 🔹 *Sliding Window / HashMap / Two Pointers* | - Frequency counting<br>- Window maintenance<br>- Substring, anagram, or unique character logic | For problems involving substrings or frequency constraints |
| **Intervals / Ranges** | 🔹 *Sorting + Merge / Sweep Line* | - Sort by start or end<br>- Merge or track active intervals | For “merge intervals,” “meeting rooms,” “insert interval,” etc. |
| **Graph Problems** | 🔹 *BFS / DFS / Dijkstra / Union–Find* | - Graph traversal<br>- Shortest paths<br>- Connected components | When relationships are between **nodes and edges** |
| **Matrix / Grid** | 🔹 *DFS / BFS / DP / Prefix Sum* | - Flood fill<br>- DP for paths<br>- Prefix sum for submatrix queries | For “number of islands,” “unique paths,” etc. |
| **Subsequence Count or Sum** | 🔹 *DP over states or combinatorial math* | - Include/exclude transitions<br>- Use powers of 2 to count frequency | For counting or summing over all subsequences |

---

## ⚙️ Conceptual Differences

| **Concept** | **Contiguity** | **Order** | **Typical Pattern** |
|--------------|----------------|------------|----------------------|
| **Subarray** | ✅ Contiguous | ✅ Preserved | Two Pointers / Prefix Sum |
| **Subsequence** | ❌ Not necessarily contiguous | ✅ Preserved | DP / Combinatorics |
| **Subset** | ❌ Not contiguous | ❌ Order doesn’t matter | Combinatorics / Bitmask |
| **Combination** | ❌ Not contiguous | ❌ Order doesn’t matter | Backtracking / Choose `k` |
| **Permutation** | ❌ Not contiguous | ✅ Order matters | Backtracking / Swap |

---

## 🎯 Pattern Thinking Framework

> - If it’s **contiguous**, think *Prefix Sum* or *Sliding Window*.  
> - If it’s **not contiguous but ordered**, think *DP over Subsequences*.  
> - If **order doesn’t matter**, think *Combinatorial / Subset patterns*.

---

### 🧭 Bonus Insight

Some advanced problems **blend these categories** —  
for example, problems that appear like subsequences but can be solved using *subarray + DP hybrid* patterns (e.g., Kadane’s algorithm variants).

---
