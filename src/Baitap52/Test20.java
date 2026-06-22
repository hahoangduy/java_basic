package Baitap52;

public class Test20 {
    public static class Users {
        private String id;
        private String name;
        private boolean isActive;

        public Users(String id, String name, boolean isActive) {
            this.id = id;
            this.name = name;
            this.isActive = isActive;
        }
    }

    public static void linearSearch(Users[] users, String targetName) {
        boolean isEqual = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(targetName) && users[i].isActive) {
                System.out.println("Id của người dùng đầu tiên có tên trùng với Target name và trạng thái isActive đang là true là " + users[i].id);
                isEqual = true;
                break;
            }
        }
        if (!isEqual) {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        /*Cho một mảng users chứa thông tin người dùng (gồm id, name, isActive). Bạn hãy viết một hàm nhận vào mảng users và một chuỗi targetName.
        Hàm cần trả về id của người dùng đầu tiên có tên trùng với targetName VÀ trạng thái isActive đang là true. Nếu không tìm thấy ai thỏa mãn, trả về -1.
        Ví dụ 1:
        Input:
        users = [
        {"id": 1, "name": "Alice", "isActive": false},
        {"id": 2, "name": "Bob", "isActive": true},
        {"id": 3, "name": "Alice", "isActive": true}
        ]
        targetName = "Alice"
        Output: 3
        Giải thích: Có hai người tên "Alice" (id 1 và id 3). Tuy nhiên, người có id 1 đang có isActive là false. Người có id 3 thỏa mãn cả hai điều kiện nên trả về 3.*/

        Users[] users = new Users[] {
                new Users("1", "Alice", false),
                new Users("2", "Bob", true),
                new Users("3", "Alice", true),
        };
        linearSearch(users, "Alice");
    }
}
