Projekt: SYWI 2014
Autor: Marcin Wnuk. PW EiTI
 
Opis bazy:
Podczas tworzenia programu została wykorzystana baza Mushroom z repozytorium archive.ics.edu.
Baza została odpowiedznio przygotowana: Podzielona na dwa równe zbiory. Pierwszy zbiór zawiera grzyby jadalne.
Drugi zbiór zawiera grzyby trujące. W obu zbiorach wykorzystano po 62 elementy. Pierwszy atrybut ze zbioru jest atrybutem decyzyjnym.

Ponieżej charakterystyka wartości atrybutów:

1. eatable=e poisoning=p
2. cap-shape: bell=b,conical=c,convex=x,flat=f, knobbed=k,sunken=s
3. cap-surface: fibrous=f,grooves=g,scaly=y,smooth=s
4. cap-color: brown=n,buff=b,cinnamon=c,gray=g,green=r, pink=p,purple=u,red=e,white=w,yellow=y
5. bruises?: bruises=t,no=f
6. odor: almond=a,anise=l,creosote=c,fishy=y,foul=f, musty=m,none=n,pungent=p,spicy=s
7. gill-attachment: attached=a,descending=d,free=f,notched=n
8. gill-spacing: close=c,crowded=w,distant=d
9. gill-size: broad=b,narrow=n
10. gill-color: black=k,brown=n,buff=b,chocolate=h,gray=g, green=r,orange=o,pink=p,purple=u,red=e, white=w,yellow=y
11. stalk-shape: enlarging=e,tapering=t
12. stalk-root: bulbous=b,club=c,cup=u,equal=e, rhizomorphs=z,rooted=r
13. stalk-surface-above-ring: fibrous=f,scaly=y,silky=k,smooth=s
14. stalk-surface-below-ring: fibrous=f,scaly=y,silky=k,smooth=s
15. stalk-color-above-ring: brown=n,buff=b,cinnamon=c,gray=g,orange=o, pink=p,red=e,white=w,yellow=y
16. stalk-color-below-ring: brown=n,buff=b,cinnamon=c,gray=g,orange=o, pink=p,red=e,white=w,yellow=y
17. veil-type: partial=p,universal=u
18. veil-color: brown=n,orange=o,white=w,yellow=y
19. ring-number: none=n,one=o,two=t
20. ring-type: cobwebby=c,evanescent=e,flaring=f,large=l, none=n,pendant=p,sheathing=s,zone=z
21. spore-print-color: black=k,brown=n,buff=b,chocolate=h,green=r, orange=o,purple=u,white=w,yellow=y
22. population: abundant=a,clustered=c,numerous=n, scattered=s,several=v,solitary=y
23. habitat: grasses=g,leaves=l,meadows=m,paths=p, urban=u,waste=w,woods=d

Uruchomienie aplikacji:
W celu uruchomienia pliku jar wymagane jest zainstalowana wersja Java w wersji conajmniej 1.6.
Aplikacja została przetesowana pod systemem Microsoft Windows XP.
By uruchomić należy w wierszu poleceń przejść do katalogu w którym znajduje się plik sywi.jar
następnie wykonać polecenie "java -jar sywi.jar". Na ekranie zostanie wyświetlone działanie programu.
Ważne by plik sywi.jar znajdował się na tym samym poziomie co folder documents zawierający bazy niezbędne do prawidłowego działania programu.

Zasada działania:
Program implementuje procedury opisane w artykule Action Reducts w języku Java 1.6. Celem programu jest znalezienie reduktu z największą wagą.
W celu wyswietlenia na ekran wszystkich reduktów należy odkomentować w kodzie linie 39 "//System.out.print(countReductMap);"

Wnioski:
Program wyliczył że największą wagę posiada redukt f7c8 (72,13%) z opisu tabeli można odczytać że oznacza to;

f7: gill-attachment=free(f)
c8: gill-spacing=close(c)

Oznacza to, by element ze zbioru trujących grzybów stał się jadalnym najlepszą opcja będzie zmiana w jego atrybutach na wyżej wymienione wartości.

