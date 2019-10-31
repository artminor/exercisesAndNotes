function fiboEvenSum(n) {
    // You can do it!
    let a = 1,
        b = 0,
        temp;
    let arr = [];
    let counter = n;

    while (n >= 0) {
        temp = a;
        a = a + b;
        arr.push(a);
        b = temp;
        n--;
    }

    let sum = 0;
    for (let i = 1; i < counter; i++) {
        if (arr[i] % 2 == 0) {
            sum += arr[i];
        }
    }
    return sum;
}

fiboEvenSum(10);