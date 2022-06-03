# OOP-Inclass-practice

## Description

This work was developed by:  Tran Thanh Hai - CTTN-KHMT K65 - Hanoi University of Science and Technology.

If this code make you confused, you are supposed to take a look into [description](https://docs.google.com/document/d/1HKY7BxPfZQik19_8du5mEJA6U6_B_Tq8ZOCvPdScTCo/edit?usp=sharing) of the code here.

## How to run it?

- First, you have to define `CongTy` and one of the `NhanVien` object, for example:

  ```java
  CongTy soICT = new CongTy("SoICT", 1e12);
  GiamDoc giangVien1 = new GiamDoc("Tran Thanh Hai", 3e7, 2.5, 3e6);
  ```

  We define object `GiamDoc` with initialized variables: `tenNhanVien`, `luongCoBan`, `heSoLuong` and `phuCap,` respectively.
- Second you have to regist defined staff with fuction:

  ```java
  soICT.themNV(giangVien1);
  ```
- Finally, you can use any methods or attributes of created `CongTy` to get needed information.

## Run and Compile small Example

[SoICT](SoICT.java) is small example for this repo

Type into the Terminal:

```
javac SoICT.java
```

to compile. Then type 

```
java SoICT
```

to see the result.
