# java_basic


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



