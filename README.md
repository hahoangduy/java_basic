# JAVA


## bit, byte, kb, mb, gb, tb,...

Bit là những con số mà máy tính có thể hiểu được 

Bit chỉ có 2 số: 0 và 1
    
Bit là đơn vị cơ bản cho các dữ liệu cơ sở:
- Byte = 8-bit
- Short = 16-bit
- Integer = 32-bit
- Long = 64-bit

    
=======
8 bit = 1 byte
1 kb = 1024 bytes
1 mb = 1024 kb
1 gb = 1024 mb
...

## Chuyển đổi decimal -> binary
Vì binary là nhị phân nên luôn phải chia 2.

<img width="400" height="317" alt="image" src="https://github.com/user-attachments/assets/35cd0c46-84b9-4590-a556-6b06f7f4ced2" />


vd: đổi 50 qua binary:
1. 50 / 2 = 25, dư 0
2. 25 / 2 = 12, dư 1
3. 12 / 2 = 6, dư 0
4. 6 / 2 = 3, dư 0
5. 3 / 2 = 1, dư 1
6. 1 / 2 = 0, dư 1

Lấy số dư từ dưới lên:
decimal (50) = binary (010011)

## Chuyển đổi binary -> decimal

<img width="930" height="521" alt="image" src="https://github.com/user-attachments/assets/9194b816-b2a6-40f3-a909-7db4d45cda2b" />

2^9 = 512

2^8 = 256

2^7 = 128

2^6 = 64

2^5 = 32

2^4 = 16

2^3 = 8

2^2 = 4

2^1 = 2

2^0 = 1

vd: đổi 1001001 qua decimal:
1. Đánh dấu các số từ phải qua trái bắt đầu = 0
2. Lấy các số từ dãy số binary nhân với 2^(số được đánh dấu bắt đầu từ trái sang phải)
3. (1 * 2^6) + (0 * 2^5) + (0 * 2^4) + (1 * 2^3) + (0 * 2^2) + (0 * 2^1) + (1 * 2^0) = 73

binary (1001001) = decimal (73)


## Quy tắc viết dấu toán tử tiền tố, hậu tố

a++, a-- ( viết phía sau biến ) -> postfix
++a, --a ( viết trước biến) -> prefix

### Ưu tiên tính toán Postfix, Prefix:

1. Prefix
2. Các phép toán còn lại
3. Postfix

## Scanner

Dùng để người dùng nhập dữ liệu
Scanner "tên biến" = new Scanner(System.in);

### Code
Có thể dùng 2 kiểu:
1. String(Chuỗi)/Byte/Float/Double "tên biến" sc.nextLine/nextByte/nextFloat(tùy theo biến đã đặt phía trước)();
Khi dùng cách dùng này thì chỉ có thể chạy code bắt đầu từ chuỗi(String) -> ... và không thể quay lại nhập chuỗi.


3. String(Chuỗi)/Byte/Float/Double "tên biến" new Scanner(System.in).nextLine/nextByte/nextFloat(tùy theo biến đã đặt phía trước)();
Khi dùng cách dùng này thì có thể nhập chuỗi(String) -> ... sau đó có thể quay lại nhập chuỗi.


## Bảng mã ASCII
<img width="930" height="521" alt="image" src="https://github.com/user-attachments/assets/15aa0f71-db65-4874-9372-d9388ac74542" />

Số Decimal đại diện cho 1 Char(ký tự)


## OOP (Object-Oriented Programming): Lập trình hướng đối tượng.

1. Khái niệm:
   - Dựa trên class và object
     + Class: Khuôn mẫu hoặc bản thiết kế chung cho các đối tượng.
     + Object: Thể hiện cụ thể được tạo ra từ lớp, có thuộc tính (dữ liệu) và phương thức (hành vi).
2. Tính chất:
   - Có 4 tính chất cốt lõi:
     + Tính đóng gói (Encapsulation): Giấu thông tin và gom dữ liệu cùng phương thức vào một đối tượng.
     + Tính kế thừa (Inheritance): Cho phép lớp con tận dụng lại mã nguồn và đặc điểm từ lớp cha.
     + Tính đa hình (Polymorphism): Một hành động có thể thực hiện theo nhiều cách khác nhau ở các đối tượng khác nhau.
     + Tính trừu tượng (Abstraction): Chỉ giữ lại các đặc điểm cần thiết và ẩn đi chi tiết phức tạp bên trong.

## Cấu trúc dữ liệu và giải thuật (Data Structures and Algorithms - DSA)

1. Khái niệm:
   - Cấu trúc dữ liệu: Là cách sắp xếp, lưu trữ dữ liệu trong bộ nhớ máy tính để chương trình truy xuất và thao tác nhanh chóng.
   - Giải thuật (Thuật toán): Là tập hợp các bước hoặc quy tắc rõ ràng, hữu hạn để giải quyết một bài toán cụ thể.

2. Chi tiết:
   
   ### Cấu trúc dữ liệu:
       - Array (Mảng): là một cấu trúc dữ liệu tập hợp các phần tử liên tiếp nhau có cùng kiểu dữ liệu, truy cập nhanh qua chỉ số (index).
       - HashMap (Bảng băm): là một cấu trúc dữ liệu lưu trữ dữ liệu theo cặp khóa và giá trị (key-value), giúp tìm kiếm, thêm hoặc xóa dữ liệu rất nhanh chóng.
       - Stack (Ngăn xếp): là một cấu trúc dữ liệu theo nguyên tắc LIFO (Last In, First Out - Vào sau ra trước), nghĩa là phần tử nào được thêm vào cuối cùng sẽ được lấy ra đầu tiên.
       - Queue (Hàng đợi): là một cấu trúc dữ liệu tuyến tính hoạt động theo nguyên tắc FIFO (First In, First Out - vào trước, ra trước).

   ### Giải thuật (Thuật toán):
       - Thuật toán tìm kiếm: Tìm vị trí phần tử, ví dụ như Tìm kiếm tuyến tính (Linear Search) hay Tìm kiếm nhị phân (Binary Search).
           + Tìm kiếm tuyến tính (Linear Search): là thuật toán cơ bản duyệt lần lượt từng phần tử từ đầu đến cuối danh sách để tìm giá trị cần thiết.
           + Tìm kiếm nhị phân (Binary Search): là thuật toán tìm kiếm hiệu quả giúp xác định vị trí của một phần tử trong một mảng đã được sắp xếp.
       - Thuật toán sắp xếp: Sắp xếp dữ liệu theo thứ tự, ví dụ như Sắp xếp nổi bọt (Bubble Sort), Sắp xếp chèn (Insertion Sort), hoặc Sắp xếp chọn (Selection Sort).
           + Bubble Sort: chạy từ đầu đến cuối mảng, nếu phần tử đứng trước lớn hơn phần tử đứng sau thì đổi chỗ, sau mỗi lần lặp phần tử lớn nhất sẽ trôi xuống dưới.
           + Insertion Sort: là một thuật toán sắp xếp đơn giản hoạt động giống như cách bạn sắp xếp các lá bài trên tay: lấy từng phần tử và chèn nó vào đúng vị trí đã được sắp xếp trước đó.
           + Selection Sort: là thuật toán sắp xếp đơn giản hoạt động bằng cách liên tục tìm phần tử nhỏ nhất từ phần chưa sắp xếp và đưa nó về đầu mảng.
       - Two pointer: là phương pháp sử dụng hai biến lưu trữ vị trí (chỉ số) để duyệt qua các phần tử trong mảng hoặc chuỗi nhằm tối ưu thời gian chạy thay vì phải dùng 2 vòng lặp.


# =====================================

# CƠ SỞ DỮ LIỆU

## Thao tác cơ bản với DATABASE

### Khởi tạo:
#### CREATE DATABASE name_database; (Viết thường hoặc viết in hoa đều được)

### Set default cho database:
#### USE name_database;

### Xóa database:
#### DROP DATABASE name_database;

### Bật, tắt mode read-only: Chỉ định database chỉ được phép đọc, không thể thực hiện các chức năng khác.
#### ALTER DATABASE name_database READ ONLY = 1;
#### ALTER DATABASE name_database READ ONLY = 0;

## Thao tác cơ bản với TABLE

### Khởi tạo:
#### CREATE TABLE name_table(
... (Các trường tương ứng với các cột trong bảng + khai báo kèm kiểu dữ liệu)
VD: table_id nvarchar(10),
    table_date date
)
- Các kiểu dữ liệu trong SQL: https://fptshop.com.vn/tin-tuc/danh-gia/-cac-kieu-du-lieu-trong-sql-168413

### Xem thông tin bảng
#### SELECT * FROM table_name;

### Đổi tên TABLE:
#### RENAME TABLE old_table_name TO new_table_name;

### Xóa TABLE:
#### DROP TABLE table_name;

### Thêm cột mới:
#### ALTER TABLE table_name
#### ADD column_name "nvarchar(10);" -> kiểu dữ liệu

### Đổi tên cột:
#### ALTER TABLE table_name
#### RENAME COLUMN old_column_name TO new_column_name;

### Đổi kiểu dữ liệu cho cột:
#### ALTER TABLE table_name
#### MODIFY COLUMN column_name "nvarchar(100)";

### Thay đổi vị trí cột:
#### ALTER TABLE table_name                  |  #### ALTER TABLE table_name
#### MODIFY COLUMN column_name nvarchar(100) |  #### MODIFY COLUMN column_name nvarchar(100)
#### AFTER column_name;                      |  #### FIRST;

### Xóa cột:
#### ALTER TABLE table_name
#### DROP COLUMN column_name;


### Chèn bản ghi vào bảng:
#### Cách 1:
#### INSERT INTO table_name
#### VALUES() -> Khai báo các giá trị tương ứng với kiểu dữ liệu của từng cột trong bảng vào trong dấu ngoặc nhọn.

#### Cách 2:
#### INSERT INTO employees
#### VALUES (2, "Squidward", "Tentacles", 15.00, "2023-01-03"), 
####        (3, "Spongebob", "Squarepants", 12.50, "2023-01-04"), 
####        (4, "Patrick", "Star", 12.50, "2023-01-05"), 
####        (5, "Sandy", "Cheeks", 17.25, "2023-01-06");

#### Cách 3:
#### INSERT INTO employees (employee_id, first_name, last_name)
#### VALUES (6, "Sheldon", "Plankton");

### Chọn cột theo chỉ định
#### SELECT column_name FROM table_name;

#### SELECT * FROM table_name
#### WHERE column_name = ...;

### Cập nhật và xóa bản ghi trong bảng:
1. Cập nhật:
   #### UPDATE table_name
   #### SET column_name = ...;

   #### UPDATE table_name
   #### SET column_name = ...
   #### WHERE column_name = ...;

   #### UPDATE table_name
   #### SET column_name = ...,
   ####     column_name = ...,
   ####     column_name = ...;
   #### WHERE column_name = ...;

2. Xóa:
   #### DELETE FROM table_name;

   #### DELETE FROM table_name
   #### WHERE column_name = ...;


## NORMAL FORM
### 1NF:
- Mọi ô dữ liệu trong bảng chỉ chứa 1 giá trị đơn duy nhất (giá trị nguyên tử) và không có nhóm dữ liệu lặp lại.

### 2NF:
- Tất cả các trường(cột) nằm trong bảng phải dựa vào khóa chính.

### 3NF:
- Đảm bảo tính độc lập, ngoại trừ khóa chính, mỗi trường trong bảng không có bất kỳ sự phụ thuộc nào và nó luôn luôn độc lập.
