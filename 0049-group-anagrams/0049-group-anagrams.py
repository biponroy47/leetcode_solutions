class Solution(object):
    def groupAnagrams(self, strs):
        from collections import defaultdict

        anagram_dict = defaultdict(list)

        for s in strs:
            # Initialize a count of 26 zeros for each letter in the alphabet
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            # Use the tuple of counts as the key
            key = tuple(count)
            anagram_dict[key].append(s)

        return list(anagram_dict.values())
