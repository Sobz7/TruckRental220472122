package za.ac.cput.repository;

import za.ac.cput.domain.LoginDetail;

import java.util.Set;

public interface ILoginDetailRepository extends IRepository<LoginDetail, String> {
        public Set<LoginDetail> getAll();
}
