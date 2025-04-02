Trong Java, **ép kiểu (type casting)** là quá trình chuyển đổi một biến từ kiểu dữ liệu này sang kiểu dữ liệu khác. Có hai loại ép kiểu chính:

1. **Ép kiểu mở rộng (Widening Casting)**: Chuyển từ kiểu dữ liệu có kích thước nhỏ hơn sang kiểu lớn hơn. Quá trình này diễn ra tự động. Ví dụ:

   ```java
   int soNguyen = 10;
   double soThuc = soNguyen; // Tự động chuyển từ int sang double
   ```


   Trong trường hợp này, giá trị `soNguyen` được tự động chuyển đổi từ kiểu `int` sang kiểu `double` mà không cần can thiệp từ lập trình viên.

2. **Ép kiểu thu hẹp (Narrowing Casting)**: Chuyển từ kiểu dữ liệu lớn hơn sang kiểu nhỏ hơn. Quá trình này cần thực hiện thủ công bằng cách chỉ định rõ kiểu dữ liệu muốn chuyển đổi. Ví dụ:

   ```java
   double soThuc = 9.78;
   int soNguyen = (int) soThuc; // Chuyển đổi từ double sang int
   ```


   Ở đây, giá trị `soThuc` được chuyển từ `double` sang `int`, và phần thập phân sẽ bị loại bỏ, kết quả là `soNguyen` có giá trị `9`.

**Lưu ý quan trọng**:

- Khi thực hiện ép kiểu thu hẹp, có thể xảy ra mất dữ liệu nếu giá trị không phù hợp với kiểu dữ liệu mới. Ví dụ, chuyển từ `long` sang `int` có thể dẫn đến mất mát giá trị nếu số quá lớn.

- Ép kiểu chỉ áp dụng giữa các kiểu dữ liệu tương thích. Ví dụ, không thể ép kiểu giữa kiểu `boolean` và các kiểu số.

- Trong lập trình hướng đối tượng, khi làm việc với các lớp kế thừa, cần chú ý đến ép kiểu đối tượng để tránh lỗi trong quá trình chạy chương trình.

Nắm vững khái niệm ép kiểu sẽ giúp bạn kiểm soát tốt hơn việc chuyển đổi dữ liệu và tránh các lỗi tiềm ẩn trong quá trình lập trình. 