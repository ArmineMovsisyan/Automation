package oop.person;

/**
 * Created BY Armine Movsisyan on 09 February,2020
 * * * Ունենք Person class որն ունի անուն, աշխատավայր եւ տարիք։
 * *  * Գրել ֆունկցիա, որը տրված մարդկանց զանգվածից կառանեձնեցնի
 * *  * - այն մարդկանց ովքեր աշխատում են պարամետրով փոխանցված աշխատավայրում +
 * *  * - ամենատարեց եւ ամենաերիտասարդ մարդուն +
 * *  * - բոլոր մարդկանց տարիքներից կվերադարձնի ամենաշատ կրկնվող տարիքը +
 * *  * - կսորտավորի մարդկանց. ըստ տարիքի +
 * *  * - կսորտավորի մարդկանց. ըստ անունի - +
 * *  * - կսորտավորի մարդկանց. ըստ աշխատատեղի - +
 * *  * - կվերադարձնի կրկնվող մարդուն կամ մարդկանց (այսինքն, ընդունենք, որ  կարա նույն մարդը կարա կրկնվի զանգվածում)
 */

class PersonApi {
    static Person[] getPersonByCompany(String company) {

        Person[] personApi = new Person[10];
        for (int i = 0; i < PersonRepository.getData().length; ++i) {
            if (PersonRepository.getData()[i].getCompany().equals(company)) {
                personApi[i] = PersonRepository.getData()[i];

            }

        }
        return personApi;

    }


}
