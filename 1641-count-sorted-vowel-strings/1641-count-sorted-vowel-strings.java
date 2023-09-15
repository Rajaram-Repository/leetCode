class Solution {
    public int countVowelStrings(int n) {
        return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
        // 5
        // 5!4!3!2!1!
        // 9 7 5 3 1
    }
}
// aaa

// aae
// aee

// aai
// aii

// aao
// aoo

// aau
// auu

// eee

// eei
// eii

// eeo
// eoo

// eeu
// euu
