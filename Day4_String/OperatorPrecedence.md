# Operator Precedence

**Operator precedence** trong Java đề cập đến thứ tự mà các toán tử được thực thi trong biểu thức. Khi có nhiều toán tử trong một biểu thức, Java sẽ xác định toán tử nào được thực hiện trước dựa trên mức độ ưu tiên của nó.

### 1. **Cách hoạt động của Operator Precedence**
Khi một biểu thức chứa nhiều toán tử, Java sẽ thực hiện các toán tử theo thứ tự ưu tiên từ cao đến thấp. Toán tử có mức ưu tiên cao sẽ được thực hiện trước. Nếu hai toán tử có cùng mức ưu tiên, thứ tự thực hiện sẽ được xác định dựa trên **associativity** (hướng thực hiện từ trái sang phải hoặc từ phải sang trái).

### 2. **Các nhóm toán tử trong Java**

Java có rất nhiều loại toán tử, và chúng được chia thành các nhóm dựa trên mức độ ưu tiên. Dưới đây là bảng các nhóm toán tử theo thứ tự ưu tiên từ cao đến thấp:

| **Toán tử**                   | **Mô tả**                                                                 |
|-------------------------------|---------------------------------------------------------------------------|
| `()`, `[]`, `.`, `++`, `--`    | Toán tử nhóm, toán tử gọi hàm, truy cập mảng, truy cập đối tượng, tăng/giảm sau |
| `+`, `-`, `~`                  | Toán tử số học và toán tử bitwise (~: toán tử phủ định bit)               |
| `*`, `/`, `%`                  | Toán tử nhân, chia và chia lấy dư                                         |
| `+`, `-`                       | Toán tử cộng và trừ                                                      |
| `<<`, `>>`, `>>>`              | Toán tử dịch chuyển bit (dịch trái, dịch phải có dấu và không dấu)       |
| `<`, `<=`, `>`, `>=`, `instanceof` | Toán tử so sánh (so sánh lớn hơn, nhỏ hơn, kiểm tra kiểu)                |
| `==`, `!=`                     | Toán tử so sánh bằng và không bằng                                        |
| `&`                            | Toán tử AND bitwise                                                      |
| `^`                            | Toán tử XOR bitwise                                                      |
| `|`                            | Toán tử OR bitwise                                                       |
| `&&`                           | Toán tử AND logic (logic AND)                                            |
| `||`                           | Toán tử OR logic (logic OR)                                              |
| `?:`                           | Toán tử điều kiện (ternary operator)                                      |
| `=`, `+=`, `-=`, `*=`, `/=`, `%=` | Toán tử gán                                                               |
| `++`, `--` (tiền tố)           | Toán tử tăng/giảm (tiền tố trước biến)                                    |
| `++`, `--` (hậu tố)            | Toán tử tăng/giảm (hậu tố sau biến)                                      |
| `!`                            | Toán tử phủ định logic (NOT)                                             |

### 3. **Đặc điểm của Associativity**
- **Associativity** xác định thứ tự thực hiện khi các toán tử có cùng mức ưu tiên. Java có hai loại associativity:
  - **Left to Right** (từ trái qua phải): Đây là quy tắc mặc định của phần lớn các toán tử trong Java.
  - **Right to Left** (từ phải qua trái): Một số toán tử, như toán tử gán `=`, có associativity phải-to-trái.

### 4. **Ví dụ minh họa về Operator Precedence**

#### Ví dụ 1: Toán tử số học và toán tử so sánh
```java
int a = 5, b = 10, c = 2;
int result = a + b * c;  // Toán tử * có ưu tiên hơn +, vậy sẽ tính b * c trước.
System.out.println(result);  // Kết quả sẽ là 25 vì b * c = 10 * 2 = 20, sau đó 5 + 20 = 25.
```

#### Ví dụ 2: Toán tử cộng và trừ
```java
int x = 5, y = 2;
int result = x - y + 3;  // Toán tử + và - có cùng mức ưu tiên, thực hiện từ trái qua phải.
System.out.println(result);  // Kết quả sẽ là 6 vì (5 - 2) + 3 = 3 + 3 = 6.
```

#### Ví dụ 3: Toán tử gán và cộng sau
```java
int a = 5;
int b = a++;  // a++ là toán tử hậu tố, do đó a được gán giá trị 5 trước, sau đó a tăng lên 6.
System.out.println(a);  // a = 6
System.out.println(b);  // b = 5
```

#### Ví dụ 4: Toán tử logic và toán tử so sánh
```java
int a = 5, b = 10, c = 3;
boolean result = (a < b) && (b > c);  // Toán tử && có mức ưu tiên cao hơn toán tử < và >.
System.out.println(result);  // Kết quả sẽ là true vì (a < b) là true và (b > c) cũng là true.
```

### 5. **Quan trọng khi sử dụng**
- **Dấu ngoặc đơn `()`** có ưu tiên cao nhất, giúp bạn kiểm soát rõ ràng thứ tự thực hiện.
- Luôn nhớ rằng **toán tử gán** (`=`) có mức ưu tiên thấp, vì vậy bạn nên tránh để chúng có thể gây ra nhầm lẫn trong các biểu thức phức tạp.
- Các toán tử logic `&&` và `||` có thể gây bất ngờ nếu không được sử dụng đúng, vì chúng có mức ưu tiên thấp hơn các toán tử so sánh (`<`, `>`, `==`, v.v.).

### Kết luận
Hiểu rõ về **operator precedence** sẽ giúp bạn viết mã Java một cách chính xác và tránh được lỗi khi sử dụng nhiều toán tử trong cùng một biểu thức. Nếu cần, hãy sử dụng dấu ngoặc đơn `()` để làm rõ thứ tự thực hiện của các toán tử trong biểu thức phức tạp.