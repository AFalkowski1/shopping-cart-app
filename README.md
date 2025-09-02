# Aplikacja Koszyka Zakupów

Projekt `shopping-cart-app` to implementacja logiki koszyka zakupów dla sklepu internetowego. Aplikacja skupia się na zaawansowanym zarządzaniu produktami, w tym sortowaniu i aplikowaniu różnorodnych promocji. Głównym celem projektu jest demonstracja kluczowych wzorców projektowych i zasad programowania obiektowego w języku Java.

### Główne funkcjonalności

Projekt implementuje następujące funkcje:

* **Zarządzanie produktami**: Aplikacja operuje na obiektach typu `Product` (kod, nazwa, cena, cena promocyjna) i przechowuje je w tablicy.
* **Wyszukiwanie**: Wyszukiwanie najtańszych/najdroższych produktów oraz `n` najtańszych/najdroższych produktów z kolekcji.
* **Sortowanie**: Sortowanie produktów według ceny (malejąco) oraz alfabetycznie według nazwy. Mechanizm sortowania jest elastyczny i może być modyfikowany.
* **Kalkulacja sumy**: Obliczanie sumy cen wszystkich produktów w koszyku.
* **Aplikowanie promocji**: Aplikowanie wielu rodzajów promocji, takich jak rabaty procentowe, gratisowe produkty czy zniżki kwotowe. Mechanizm promocji został zaprojektowany w taki sposób, aby łatwo było dodawać i usuwać nowe zasady.

### Kluczowe aspekty techniczne

Projekt został zrealizowany z naciskiem na czysty kod i zastosowanie zasad programowania obiektowego:

* **Wzorce projektowe**: W implementacji koszyka i promocji użyto **wzorca `Command`**, co zapewnia elastyczność i rozszerzalność systemu.
* **Zasady SOLID**: Zastosowano **`Dependency Inversion Principle`** w mechanizmie sortowania, co umożliwia łatwą zmianę kryteriów sortowania (np. po cenie, po nazwie) bez modyfikacji głównej logiki.
* **Interfejsy Javy**: Wykorzystano interfejsy `Comparable` i `Comparator` do implementacji elastycznego mechanizmu sortowania.
* **Testy jednostkowe**: Projekt zawiera kompleksowe **testy jednostkowe** dla wszystkich zaimplementowanych funkcjonalności, co gwarantuje poprawność działania aplikacji.

### Jak uruchomić?

Aby uruchomić projekt, upewnij się, że masz skonfigurowane środowisko Java i skompiluj kod, używając narzędzi do budowania projektów Java (np. Maven lub Gradle).
