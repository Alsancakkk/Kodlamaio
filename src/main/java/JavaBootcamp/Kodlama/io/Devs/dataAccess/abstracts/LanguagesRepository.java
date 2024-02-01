package JavaBootcamp.Kodlama.io.Devs.dataAccess.abstracts;

import JavaBootcamp.Kodlama.io.Devs.entities.concretes.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguagesRepository extends JpaRepository<Languages,Integer>
// JpaRepository getAll gibi operasyonları sağlar
{
    boolean existsByName(String name);
        Languages findById(int id);

}
