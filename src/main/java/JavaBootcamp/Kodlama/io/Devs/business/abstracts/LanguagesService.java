package JavaBootcamp.Kodlama.io.Devs.business.abstracts;

import JavaBootcamp.Kodlama.io.Devs.entities.concretes.Languages;

import java.util.List;

public interface LanguagesService {


    List<Languages> getAll(); //Languages hepsini listeleme
    Languages findById(int id);  //Id ile Languages çağırma
    Languages add(Languages languages) throws Exception; // Ekleme
    void deleteById(int id);    //Id ile silme
    Languages save(Languages languages) throws Exception; // Güncelleme


}
