# Complex Math App
Amacımız ekrandan çok sayıda input alıp bunları hesaplayıp ekrana geri yazan çalıştırılabilir bir jar oluşturup consoledan calıstırmak.

* **Proje Adı:** complex-math-app
* **Package Adı:** com.albaycan.complexmathapp
* **Yapısı:** Uygulama içinde 2 adet class olsun

### 1. AppManager.java: 
* Ekrana aşagıdaki gibi bir yazı yazacak. Başında > olan satırlar örnek olarak kullanıcıdan gelen inputları gösteriyor.

```
===============================
***********Welcome*************
===============================
Please enter number 1:
>10
Please enter number 2:
>5
Would you like to add more numbers? y
Please enter number 3: 
>8
Would you like to add more numbers? y
Please enter number 4: 
>15
Would you like to add more numbers? n
What would you like to do now?
(1)Sum
(2)Multiply
Press Ctrl + C to exit.
>1
Sum of your numbers are : ‘38’
Press A to go back to menu or Ctrl + C to exit.
```

* Kullanıcı ESC’e basana kadar hesaplara devam edebilecek.

### 2. BasicMath.java: 
* Constructor'ında limitsiz değer alabilir. (Integer… args)’a bi bak istersen.
* 2 adet methodu olsun add(), multiply().

	add()
	multiply() 
	
### Implementation
1. GitHub'da yeni bir repository oluşturup, kodları oraya push edelim. Repo adı proje adının aynısı olsun.

### Dikkat edilecek hususlar
* Proje klasör yapısı şu şekilde olsun

	/complex-math-app
	|..../src  --> tüm class'lar bu klasör içinde olsun.
	|…..* 		--> diger tüm dosyalar ana kasör içinde yer alsın. (manifesto, readme, gitignore vs. )

* Proje klasörünün içine README.md dosyası oluşturup, içine tüm bu yazdıklarımı baştan sona kopyalayıp-yapıştırıp, formatlayalım.

