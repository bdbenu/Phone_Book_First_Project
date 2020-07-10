package in.nit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.ContactModel;
@Repository
public interface ContactRepositary extends JpaRepository<ContactModel, Serializable>{

}
