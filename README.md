### PROBLEM:  
##### Given an array, reduce the array to a single element with minimum cost. For reducing, remove two elements from the array, add those two numbers and keep the sum back in the array. The cost of each operation is the sum of the elements removed in that step. Find the minimum cost to reduce the array to a single element.

Example, let the array A = [1,2,3]

Then, in the first step,(i.e. i=1) we can remove 1 and 2, add both of them and keep the sum back in array. Cost of this step would be (1+2) = 3.

So A = [3,3], Cost(i=1) = 3

In second step,(i.e. i=2) we can remove both elements from the array and keep the sum back in array again. Cost of this step would be 3 + 3 = 6.

So, A = [6], Cost(i=2) = 6

So total cost turns out to be 9 (6+3).
