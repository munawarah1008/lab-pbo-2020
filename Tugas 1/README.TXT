------------------------------------------------------------------------
Program sederhana trans koetaradja ini terdiri dari 3 class yaitu class
Penumpang, Bus dan Main. Dimana pada bus ini hanya tersedia 6 bangku diantaranya
untuk penumpang prioritas yaitu orang yang berumur lebih dari 60 tahun atau 
kurang dari 10 tahun atau ibu hamil. Sedangkan sisanya diberikan kursi untuk
penumpang biasa.

Ketentuan lebih terperinci sebagai berikut :

1. Bus hanya memiliki 6 kursi penumpang, yang terdiri dari 4 kursi penumpang biasa dan 2 kursi prioritas.
2. Kursi prioritas hanya dapat diisi oleh orang-orang berikut : 
   Lansia : umur lebih dari 60 tahun 
   Anak-anak : umur kurang dari 10 tahun 
   serta Ibu hamil
3. Penumpang biasa dilarang duduk di kursi prioritas
4. Namun penumpang prioritas boleh duduk di kursi biasa.
5. Penumpang tidak dapat masuk atau menaiki bus jika kursi sudah penuh terisi

- Class Penumpang
  class ini mewakili penumpang baik itu prioritas maupun biasa
  dimana nantinya diperlukan identitas penumpang seperti nama, umur dan status hamil
- Class Bus
  class ini mewakili objek bus yang dinaiki oleh para penumpang dimana nantinya hanya 
  boleh dinaiki oleh 6 penumpang saja. terdapat beberapa method sperti method contructor,
  method accessor dan toString sesuai dengan yang dijelaskan pada soal
- Class Main
  class ini merupakan class utama yang mana akan di run kan program nya oleh user
------------------------------------------------------------------------

PROJECT TITLE : PROGRAM PENGELOLAAN PENUMPANG BUS TRANS KOETARADJA
PURPOSE OF PROJECT: untuk memenuhi tugas praktikum lab PBO
VERSION or DATE: 03-12-2020
HOW TO START THIS PROJECT:
- Repository : https://github.com/munawarah1008/lab-pbo-2020/Tugas-1
- compile code : javac Main.java
- run program : java Main
AUTHORS: Munawarah, nim : 1908107010002
USER INSTRUCTIONS:
- class yang harus di run adalah class Main.java
- menginputkan pilihan yang ada sesuai dengan menu yang tersedia
- nama yang diinputkan harus nama pendek atau satu kata
- jika ingin menyudahi simulasi pilih opsi 4
