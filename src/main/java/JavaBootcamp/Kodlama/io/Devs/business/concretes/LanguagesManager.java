package JavaBootcamp.Kodlama.io.Devs.business.concretes;

import JavaBootcamp.Kodlama.io.Devs.business.abstracts.LanguagesService;
import JavaBootcamp.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
import JavaBootcamp.Kodlama.io.Devs.entities.concretes.Languages;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguagesManager implements LanguagesService {
    private LanguagesRepository languagesRepository;

    public LanguagesManager(LanguagesRepository languagesRepository) {
        this.languagesRepository = languagesRepository;
    }

    @Override
    public List<Languages> getAll() {
        return languagesRepository.findAll();
    }

    @Override
    public Languages findById(int id) {
        return languagesRepository.findById(id);
    }

    @Override
    public Languages add(Languages languages) throws Exception {
        if (languages.getName()== null || languages.getName().isEmpty()) {
            throw new Exception("Programlama dili boş geçemez");

        }
        return languagesRepository.save(languages);
    }

    @Override
    public void deleteById(int id) {
      languagesRepository.deleteById(id);
    }

    @Override
    public Languages save(Languages languages) throws Exception  {
       if (languagesRepository.existsByName(languages.getName())) {
           throw new Exception("Bu isimde bir dil zaten mevcut"+languages.getName());
       }
        return languagesRepository.save(languages);
    }

    // Listeleme
//    @Override
//    public List<Languages> getAll() {
//        return languagesRepository.getAll();
//    }
//    // Id ile getirme
//    @Override
//    public Languages getById(int id) {
//        return languagesRepository.getById(id);
//    }
//    // Ekleme
//    @Override
//    public void add(Languages languages) throws Exception {
//       if (languages.getName() == null || languages.getName() == ""){
//           throw new Exception("Programlama dili boş geçilemez");
//       }
//    }
//    // Silme
//    @Override
//    public boolean delete(int id) {
//        return languagesRepository.delete(id);
//    }
//    // Güncelleme
//    @Override
//    public boolean update(Languages languages) throws Exception {
//        if (languages.getName() == null || languages.getName() == "")
//            throw new Exception("Programlama dili boş geçilemez");
//        return languagesRepository.update(languages);
//    }
}
