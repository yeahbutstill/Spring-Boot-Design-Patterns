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
---
## Prototype
- GOF : Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype. 
- Tentukan jenis objek yang akan dibuat menggunakan contoh prototipe, dan buat objek baru dengan menyalin objek prototipe-nya.

## Motivasi
- Pada beberapa kasus, kita sering sekali menemui pembuatan object dengan beberapa data yang sama 
- Jika kita membuat object tersebut secara manual satu persatu, maka akan rentang terhadap kesalahan, terutama ketika object dengan jenis tertentu harus berubah  datanya 
- Prototype pattern merupakan pattern dimana kita akan membuat object prototype, lalu saat kita membuat object baru, kita tidak perlu membuat object dari awal lagi, kita cukup menyalin data dari object prototype 
- Hal inin membuat pembuatan object lebih mudah, dan jika data prototype ingin diubah, kita bisa dengan mudah mengubah prototype, dan secara otomatis semua object baru dari prototype tersebut akan berubah datanya

## Keuntungan
- Menambah dan menghapus prototype object sangat mudah, karena bukan sub-class, sehingga menambah dan menghapus prototype object tidak sesulit jika menggunakan class inheritance 
- Membuat jenis object baru sangat mudah, hanya dengan menambah atau mengubah attribute object prototype, tidak perlu ada penambahan class baru 
- Menurunkan jumlah subclass, pada pattern Factory Method, kadang menghasilkan class hirarki yang banyak, prototype bisa mencegah terjadinya class hirarki yang terlalu banyak 
- Prototype object bahkan bisa dibuat pada saat runtime (aplikasi berjalan), karena tidak membutuhkan deklarasi class baru

## Prototype Pattern di Spring Boot
- Kita sudah tahu secara default bean di Spring adalah singleton, artinya ketika kita akses bean nya, sebenarnya dia adalah object yang sama 
- Di Spring, kita bisa ubah scope bean dari singleton menjadi prototype. Saat kita ubah menjadi prototype, secara otomatis object akan selalu dibuat baru sesuai dengan deklarasi yang ada di bean 
- Dengan demikian, implementasi prototype di Spring sangat mudah

[disini](https://docs.google.com/presentation/d/18ZkhRtSo6qkGFKOpcpBQYo4SOuQCqx2olxuz9ClJR3I/edit#slide=id.gd87638d45d_0_178)


