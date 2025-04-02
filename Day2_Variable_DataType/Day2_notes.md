# Variable & Data Type

Trong Java, **biến (variable)** là các ô chứa dùng để lưu trữ giá trị dữ liệu. Mỗi biến có một **kiểu dữ liệu (data type)** xác định loại và phạm vi giá trị mà nó có thể chứa. Dưới đây là những điểm quan trọng bạn cần biết về biến và kiểu dữ liệu trong Java:

### 1. Các loại biến trong Java

- **Biến cục bộ (Local Variables):** Được khai báo bên trong một phương thức, constructor hoặc khối lệnh và chỉ có hiệu lực trong phạm vi đó.

- **Biến thể hiện (Instance Variables):** Được khai báo trong một lớp nhưng bên ngoài các phương thức. Chúng thuộc về một đối tượng cụ thể và giá trị của chúng có thể khác nhau giữa các đối tượng.

- **Biến tĩnh (Static Variables):** Được khai báo với từ khóa `static` trong một lớp. Chúng thuộc về lớp và được chia sẻ giữa tất cả các đối tượng của lớp đó.

### 2. Các kiểu dữ liệu trong Java

Java có hai nhóm kiểu dữ liệu chính:

- **Kiểu dữ liệu nguyên thủy (Primitive Data Types):** Bao gồm
  - `byte`: 8-bit, lưu trữ giá trị từ -128 đến 127
  - `short`: 16-bit, từ -32,768 đến 32,767
  - `int`: 32-bit, từ -2,147,483,648 đến 2,147,483,647
  - `long`: 64-bit, từ -9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807
  - `float`: 32-bit, lưu trữ số thực với độ chính xác đơn
  - `double`: 64-bit, lưu trữ số thực với độ chính xác kép
  - `char`: 16-bit, lưu trữ một ký tự Unicode
  - `boolean`: 1-bit, chỉ nhận giá trị `true` hoặc `false`. 

- **Kiểu dữ liệu tham chiếu (Reference Data Types):** Bao gồm các đối tượng, mảng và các cấu trúc dữ liệu phức tạp khác. Ví dụ: `String`, `Array`, `Class`. 

### 3. Khai báo và khởi tạo biến

Để khai báo một biến trong Java, bạn cần xác định kiểu dữ liệu và tên biến. Ví dụ


```java
int tuoi;
String ten;
```


Bạn có thể khởi tạo biến ngay khi khai báo:


```java
int tuoi = 25;
String ten = "Nguyễn Văn A";
```


### 4. Quy tắc đặt tên biến

- Tên biến phải bắt đầu bằng một chữ cái, ký tự gạch dưới `_` hoặc ký hiệu đô la `$`.
- Các ký tự tiếp theo có thể là chữ cái, chữ số, gạch dưới hoặc đô la.
- Tên biến phân biệt chữ hoa và chữ thường.
- Không được sử dụng các từ khóa của Java làm tên biến.

Nắm vững các khái niệm về biến và kiểu dữ liệu sẽ giúp bạn viết mã Java hiệu quả và tránh được nhiều lỗi phổ biến. 