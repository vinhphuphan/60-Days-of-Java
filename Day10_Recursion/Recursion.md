Tuyệt vời, bạn đang học đến ngày 10 và đến một chủ đề quan trọng trong Java – **Recursion (Đệ quy)**. Đây là một trong những khái niệm cốt lõi của lập trình nói chung, không chỉ Java. Dưới đây là tất cả những gì bạn cần biết khi học về đệ quy trong Java:

---

## 🔁 Recursion là gì?

**Đệ quy** là kỹ thuật trong lập trình mà một **hàm tự gọi lại chính nó** để giải quyết một bài toán. Bài toán lớn được chia nhỏ thành các bài toán con giống hệt nhau nhưng đơn giản hơn, cho đến khi đạt đến điều kiện cơ sở (base case).

---

## 🔧 Cấu trúc cơ bản của một hàm đệ quy

```java
void recursiveMethod() {
    if (base condition) {
        // dừng đệ quy
        return;
    } else {
        // gọi lại chính nó
        recursiveMethod();
    }
}
```

---

## 🧠 Hai thành phần bắt buộc của đệ quy

1. **Điều kiện dừng (base case)**  
   Nếu không có điều kiện dừng, hàm sẽ gọi mãi và gây **StackOverflowError**.

2. **Lời gọi đệ quy (recursive call)**  
   Hàm gọi lại chính nó với phiên bản **nhỏ hơn, đơn giản hơn** của bài toán.

---

## 📌 Ví dụ kinh điển

### ✅ Tính giai thừa (factorial)

```java
int factorial(int n) {
    if (n == 0) return 1; // base case
    return n * factorial(n - 1); // recursive call
}
```

### ✅ Tính dãy Fibonacci

```java
int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

> ⚠️ Lưu ý: Fibonacci đệ quy có hiệu suất rất thấp nếu không tối ưu (dùng memoization hoặc chuyển sang vòng lặp).

---

## 📉 Ưu và nhược điểm của đệ quy

### ✅ Ưu điểm:
- Code ngắn gọn, dễ hiểu cho các bài toán chia nhỏ (như DFS, duyệt cây, backtracking…)
- Rất phù hợp với cấu trúc dữ liệu **cây** và **đồ thị**

### ❌ Nhược điểm:
- Có thể **gây tràn stack** nếu gọi đệ quy quá nhiều lần (deep recursion)
- Thường **hiệu suất kém hơn** so với vòng lặp (trừ khi có tối ưu như tail recursion hoặc memoization)

---

## 💡 Khi nào nên dùng đệ quy?

- Bài toán có thể chia thành các bài toán con giống nhau
- Dữ liệu có cấu trúc phân nhánh như **cây**, **đồ thị**, hoặc cần duyệt mọi khả năng (backtracking)
- Khi viết thuật toán như tìm tổ hợp, hoán vị, DFS, duyệt cây nhị phân...

---

## 🛠️ Một số mẹo học đệ quy hiệu quả:

- Luôn xác định rõ **điều kiện dừng**
- Dùng giấy bút hoặc debug để **vẽ lại lời gọi đệ quy**
- So sánh giải pháp **đệ quy và lặp** để thấy rõ ưu nhược điểm
- Tập giải các bài: giai thừa, Fibonacci, duyệt cây, dãy nhị phân, tổ hợp – hoán vị...