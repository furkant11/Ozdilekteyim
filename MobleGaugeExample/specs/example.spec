Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

OzdilekteyimTest
--------
* "1" kadar bekle
* Elementi "//*[@text='Vazgeç']" bul ve "Vazgeç" kontrol et
* "com.ozdilek.ozdilekteyim:id/btnSuccess" Id'li elemente tikla
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" Id'li elemente tikla
* "2" kadar bekle
* Elementi "//*[@text='Erkek']" bul ve "Erkek" kontrol et
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/nav_categories" Id'li elemente tikla
* "2" kadar bekle
* Elementi "//*[@text='Markalar']" bul ve "Markalar" kontrol et
* "2" kadar bekle
* "//*[@text='Kadın']" xpath'li elemente tikla
* "2" kadar bekle
* "//*[@text='Pantolon']" xpath'li elemente tikla
* "2" kadar bekle
* Scroll
* "2" kadar bekle
* Scroll
* "2" kadar bekle
* Rastgele urun ekleme
* "2" kadar bekle
* Elementi "//*[@text='Listeme Ekle']" bul ve "Listeme Ekle" kontrol et
* "com.ozdilek.ozdilekteyim:id/imgFav" Id'li elemente tikla
* "2" kadar bekle
* Elementi "//*[@text='Beni Hatırla']" bul ve "Beni Hatırla" kontrol et
* "com.ozdilek.ozdilekteyim:id/textInputLayoutEmail" Id'li elemente tikla
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/etEposta']" yerine "furkan99ua@hotmail.com" degerini yaz
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/etPassword" Id'li elemente tikla
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/etPassword']" yerine "furkan11" degerini yaz
* "com.ozdilek.ozdilekteyim:id/ivBack" Id'li elemente tikla
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/ivBack" Id'li elemente tikla
* "2" kadar bekle
* Rastgele urun ekleme
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/relLayAddCartBtn" Id'li elemente tikla
* "2" kadar bekle