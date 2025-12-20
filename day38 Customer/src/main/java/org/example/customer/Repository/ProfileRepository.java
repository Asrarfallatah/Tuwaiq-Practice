package org.example.customer.Repository;


import org.example.customer.Model.Customer;
import org.example.customer.Model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile , Integer> {

    Profile findProfileByProfileId(Integer profileId);

}
