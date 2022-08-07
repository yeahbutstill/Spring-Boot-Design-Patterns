# Spring-Boot-Design-Patterns
___
## Singleton Pattern di Spring Boot

- Implementasi singleton pattern di Spring sangatlah mudah, kita bahkan tidak perlu membuat class khusus singleton 
- Secara default object bean yang terdapat di Spring sudah singleton, jadi secara tidak sadar sebenarnya kita sudah mengimplementasikan singleton pattern
___
## Kapan Menggunakan Singleton Pattern
- Saat menggunakan Spring, sebisa mungkin selalu menggunakan singleton pattern, kecuali memang ada kebutuhan khusus sehingga kita tidak ingin menggunakan singleton 
- Secara default, Spring selalu membuat object secara singleton, dan secara default object akan dibuat secara eager (langsung di awal ketika aplikasi dijalankan), namun jika kita ingin membuat object singleton ketika object akan diakses, kita bisa mengubahnya menjadi lazy (artinya hanya dibuat ketika pertama kali diakses)
- Namun jika objectnya berat, seperti koneksi ke database, membuat http client, dan lain-lain, sangat disarankan membuat object singleton yang eager


