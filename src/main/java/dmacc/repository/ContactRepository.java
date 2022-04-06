/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 7, 2022
**/
package dmacc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Contact;
/**
 * @author jake
 *
 */
public interface ContactRepository extends JpaRepository<Contact, Long>  {

}
