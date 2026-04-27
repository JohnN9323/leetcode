class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        k%=n 

        def reverse_slice(start, end):
            while start < end:
                nums[start], nums[end] = nums[end], nums[start]
                start +=1
                end -=1
        
        reverse_slice(0, n-1)
        reverse_slice(0, k-1)
        reverse_slice(k, n-1)

        return nums