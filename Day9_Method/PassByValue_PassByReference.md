Rất nhiều người dễ nhầm lẫn, nên mình sẽ giải thích **ngắn gọn, dễ hiểu, đúng bản chất** nhé:

---

### ✅ Java là **pass by value 100%**  
➡️ Nhưng cách hoạt động **khác nhau giữa kiểu dữ liệu nguyên thủy (primitive)** và **object** — khiến dễ hiểu nhầm.

---

## 🔹 1. Với **kiểu nguyên thủy (int, double, boolean,...)**
```java
void changeValue(int x) {
    x = 100;
}
```
➡️ Java **copy giá trị** của `x`, nên thay đổi bên trong không ảnh hưởng biến gốc.

📌 **Kết luận**: `int`, `double` → **giá trị không thay đổi** sau khi truyền.

---

## 🔹 2. Với **object / array**
```java
void modifyList(ArrayList<String> list) {
    list.add("Java");
}
```
➡️ Java **copy địa chỉ object (reference)** → cả trong & ngoài cùng trỏ tới **một object**.  
→ Thay đổi bên trong **có ảnh hưởng ra ngoài**.

📌 Nhưng bản chất vẫn là **pass by value** — Java chỉ **copy giá trị của reference**, không phải pass-by-reference thật sự.

---

## 🎯 Kết luận đơn giản:
| Kiểu dữ liệu     | Truyền như nào     | Ảnh hưởng bên ngoài |
|------------------|--------------------|----------------------|
| `int`, `double`  | Copy giá trị       | ❌ Không ảnh hưởng   |
| Object, Array    | Copy địa chỉ (reference value) | ✅ Có thể thay đổi bên trong |

---

Bạn muốn mình minh họa bằng ví dụ code cụ thể để dễ hiểu hơn không?