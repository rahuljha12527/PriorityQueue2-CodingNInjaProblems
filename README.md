# PriorityQueue2-CodingNInjaProblems

<h1>Q1.Check MAX HEAP</h1>

Q1.Given an array of integers, check whether it represents max-heap or not.<br>
Return true or false.<br>
Input Format :<br>
Line 1 : An integer N i.e. size of the array<br>
Line 2 : N integers which are elements of the array, separated by spaces<br>
Output Format :<br>
true if it represents max-heap and false if it is not a max-heap<br>
Constraints :<br>
1 <= N <= 10^5<br>
1 <= Ai <= 10^5<br>


<h1>Q2.Inplace Heap Sort</h1>

Q2.Given an integer array of size n. Sort this array (in decreasing order) using heap sort.<br>
Space complexity should be O(1).<br>
Input Format :<br>
Line 1 : Integer n, Array size<br>
Line 2 : Array elements, separated by space<br>
Output Format :<br>
Array elements after sorting<br>
Constraints :<br>
1 <= n <= 10^6<br>
Sample Input:<br>
6 <br>
2 6 8 5 4 3<br>
Sample Output:<br>
8 6 5 4 3 2<br>


<h1>Q3.K Largest Element</h1>
Q3.You are given with an integer k and an array of integers that contain numbers in random order. Write a program <br>
to find k largest numbers from given array. You need to save them in an array and return it.<br>
Time complexity should be O(nlogk) and space complexity should be not more than O(k).<br>
Order of elements in the output is not important.<br>
Input Format :<br>
Line 1 : Size of array (n)<br>
Line 2 : Array elements (separated by space)<br>
Line 3 : Integer k<br>
Output Format :<br>
k largest elements<br>
Sample Input :<br>
13<br>
2 12 9 16 10 5 3 20 25 11 1 8 6 <br>
4<br>
Sample Output :<br>
12<br>
16<br>
20<br>
25<br>

<h1>Q4.k Smallest Element</h1>
Q4.You are given with an integer k and an array of integers that contain numbers in random order. Write a program<br> to find k smallest numbers from given array. You need to save them in an array and return it.<br>
Time complexity should be O(nlogk) and space complexity should be not more than O(k).<br>
Order of elements in the output is not important.<br>
Input Format :<br>
Line 1 : Size of array (n)<br>
Line 2 : Array elements (separated by space)<br>
Line 3 : Integer k<br>
Output Format :<br>
k smallest elements<br>
Sample Input 1 :<br>
13<br>
2 12 9 16 10 5 3 20 25 11 1 8 6 <br>
4<br>
Sample Output 1 :<br>
5<br>
3<br>
2<br>
1<br>

<h1>Q4.Kth-Largest Element</h1>
Given an array A of random integers and an integer k, find and return the kth largest element in the array.
Try to do this question in less than O(nlogn) time.
Input Format :
Line 1 : An integer N i.e. size of the array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : An integer k
Output Format :
kth largest element
Input Constraints :
1 <= N, Ai, k <= 10^5
Sample Input 1 :
6
9 4 8 7 11 3
2
Sample Output 1 :
9
Sample Input 2 :
8
2 6 10 11 13 4 1 20
4
Sample Output 2 :
10
