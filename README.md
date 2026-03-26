# 🐟Tugas2-Strukdat-AquaFeedPro-OOP

Tugas ini merupakan implementasi paradigma Object-Oriented Programming (OOP) menggunakan bahasa Java untuk menyelesaikan masalah manajemen pemberian pakan ikan otomatis.

---

## 📝 1. Deskripsi Kasus
**"AquaFeed Pro System"** dirancang untuk membantu pemilik akuarium dalam mengelola penjadwalan pakan secara presisi. Masalah utama yang diselesaikan adalah ketidakteraturan pemberian nutrisi saat pemilik tidak berada di rumah. 

Sistem ini mendukung berbagai tipe dispenser pakan (*feeders*) yang disesuaikan dengan karakteristik fisik pakan (Pelet, Cair, atau Tablet). Selain memberi makan, sistem ini memastikan kebersihan alat dan kualitas pakan tetap terjaga melalui fitur maintenance otomatis.

---

## 📊 2. Class Diagram
Rancangan arsitektur sistem menggunakan class diagram:

![Class Diagram](./assets/Screenshot%202026-03-26%20134156.png)

---

## 💻 3. Penjelasan Prinsip OOP
Dalam kode ini, saya menerapkan 4 pilar utama OOP:

1.  **Abstraction (Abstraksi)**: Menggunakan `abstract class FishFeeder` sebagai kerangka utama. Objek tidak bisa dibuat langsung dari kelas ini, melainkan harus melalui kelas anak yang lebih spesifik.
2.  **Inheritance (Pewarisan)**: Kelas `PelletFeeder` dan `LiquidFeeder` mewarisi atribut dasar seperti `feederID`, `fishType`, dan `foodStock` dari kelas induk.
3.  **Encapsulation (Pengkapsulan)**: Atribut seperti `pelletSize` dan `dosageML` bersifat `private` agar data terlindungi dan hanya bisa diakses melalui metode yang ditentukan.
4.  **Polymorphism (Polimorfisme)**: Method `dispense()` diimplementasikan secara berbeda pada setiap kelas anak (Method Overriding), sehingga satu perintah menghasilkan aksi yang sesuai dengan jenis pakannya.

---

## ✨ 4. Penjelasan Keunikan Program
Berbeda dengan sistem standar, **AquaFeed Pro** menonjolkan fitur **"Smart Maintenance"**:
* **Agitator Logic (Pellet)**: Secara otomatis menggetarkan wadah pakan sebelum dikeluarkan untuk memastikan pelet tidak menggumpal akibat kelembapan.
* **Self-Cleaning Nozzle (Liquid)**: Melakukan pembersihan saluran secara otomatis setelah pakan cair disemprotkan agar tidak terjadi penyumbatan.

---

## 📸 5. Screenshot Output
Berikut adalah hasil eksekusi program pada terminal:

![Screenshot Output](./assets/Int%20Amount%20Flow-2026-03-26-063940.png)
