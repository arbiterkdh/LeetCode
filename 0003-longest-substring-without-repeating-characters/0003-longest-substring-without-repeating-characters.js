/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let set = new Set();
    let l = 0, r = 0;
    let max = 0;
    while (r < s.length) {
        if (!set.has(s[r])) {
            set.add(s[r]);
            r++;
            if (max < r - l) max = r - l;
        } else {
            set.delete(s[l]);
            l++;
        }
    }
    return max;
};