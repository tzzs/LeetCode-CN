#include <stdio.h>
#include <stdbool.h>

bool isPalindrome(int x) {
    if (x < 0) {
        return false;
    }
    int begin = x, temp, end = 0;
    while (x != 0) {
        temp = x % 10;
        x /= 10;
        end = end * 10 + temp;
    }
    if (begin == end) {
        return true;
    } else {
        return false;
    }
}

int main() {
    printf("Hello, World!\n");
    bool x = isPalindrome(121);
    printf("%d", x);
    return 0;
}