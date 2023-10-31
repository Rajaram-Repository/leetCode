/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include <stdio.h>
#include <stdlib.h>
int* findArray(int* pref, int prefSize, int* returnSize){
    int* result = (int*)malloc(prefSize * sizeof(int));
    result[0] = pref[0];
    for (int i = 1; i < prefSize; i++) {
        result[i] = pref[i] ^ pref[i - 1];
    }
    *returnSize = prefSize;
    return result;
}
