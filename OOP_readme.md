# OOP
## Polymorphism

### Tính đa hình thể hiện ở việc nạp chồng phương thức và ghi đè phương thức.
* Nạp chồng phương thức: Ở cùng một class thì 1 phương thức có thể cùng tên nhưng khác tham số và khác kết quả trả về, cũng có thể hiểu là nhiều phương thức có cùng 1 tên. 

* Ghi đè phương thức: Ở class cha định nghĩa một phương thức theo 1 cách, ở lớp con kế thừa lại lớp cha cũng mang phương thức đó nhưng ta có thể định nghĩa lại phương thức theo một cách khác, khi in kết quả ra màn hình thì sẽ in phương thức của lớp con.

Ví dụ

* Nạp chồng: Con mèo có thể kêu gừ gừ, hoặc kêu meo meo. Con chó có thể kêu gâu gâu hoặc ử ử ...

* Ghi đè: Lớp nam và lớp nữa đều được kế thừa từ lớp con người, đối tượng con người có phương thức lao động bằng tay, đối tượng nam triển khai lại phương thức lao động đó bằng săn bắn, đối tượng nữ triển khai lại phương thức lao động đó bằng trồng trọt.

## Inheritance

### Tính kế thừa được thể hiện ở từ khóa extends, lớp con mang toàn bộ phương thức và thuộc tính của lớp cha.

## Encapsulation

### Tính đóng gói được thể hiện qua các từ khóa access modifier đặt ở trước thuộc tính, thứ tự về phạm vi truy cập như sau:

* public : các class khác có thể truy cập được các thuộc tính/hàm đó.
* protected : class khác folder nhưng được thừa kế thì mới truy cập được, còn nếu không thừa kế thì không truy cập được.
* default : 2 class mà đặt khác folder sẽ không truy cập nhau được.
* private: class khác không truy cập được.

## Abstract

### Tính trừu tượng được thể hiện qua interface, interface không phải là lớp, nó không có thuộc tính và phương thức chỉ có tên chứ không có than, bình thường tính kế thừa là lớp con kế thừa các đặc tính và phương thức của lớp cha, nhưng tính trừu tượng là khi mà các đối tượng của lớp có thể thực hiện được các phương thức của một interface nào đó mà không cần kế thừa thuộc tính, nhưng interface sẽ chỉ định nghĩa phương thức qua tên, còn đối tượng nào muốn thực hiện phương thức của interface đó thì phải "xin phép" interface đó và viết lại chính hàm đó theo cách riêng biệt.


## Lưu ý

* Nếu nói về tính trừu tượng thì còn có cả abstract class, sẽ xem những method nào là dung chung cho các con, và mỗi con sẽ thực hiện riêng biệt ở class con, tuy là chung về hành động, nhưng kết quả có thể khác.

* Còn về interface nó vẫn là class/lớp, nhưng đặc biệt là nó chỉ dung để trừu tượng các hành động mà các class khác tuy khác về class cha, như là class Pet, thì có dog, cat. Còn Person thì có Student hoặc Employee, nhưng có thể có chung về hành động là run().
