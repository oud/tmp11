package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Adresse;
import com.mycompany.myapp.domain.DemandeXRM;
import com.mycompany.myapp.domain.Email;
import com.mycompany.myapp.domain.PmEtablissement;
import com.mycompany.myapp.domain.Telephone;
import com.mycompany.myapp.service.dto.AdresseDTO;
import com.mycompany.myapp.service.dto.DemandeXRMDTO;
import com.mycompany.myapp.service.dto.EmailDTO;
import com.mycompany.myapp.service.dto.PmEtablissementDTO;
import com.mycompany.myapp.service.dto.TelephoneDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PmEtablissement} and its DTO {@link PmEtablissementDTO}.
 */
@Mapper(componentModel = "spring")
public interface PmEtablissementMapper extends EntityMapper<PmEtablissementDTO, PmEtablissement> {
    @Mapping(target = "adresse", source = "adresse", qualifiedByName = "adresseId")
    @Mapping(target = "email", source = "email", qualifiedByName = "emailId")
    @Mapping(target = "telephone", source = "telephone", qualifiedByName = "telephoneId")
    @Mapping(target = "demandeXRM", source = "demandeXRM", qualifiedByName = "demandeXRMId")
    PmEtablissementDTO toDto(PmEtablissement s);

    @Named("adresseId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AdresseDTO toDtoAdresseId(Adresse adresse);

    @Named("emailId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    EmailDTO toDtoEmailId(Email email);

    @Named("telephoneId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TelephoneDTO toDtoTelephoneId(Telephone telephone);

    @Named("demandeXRMId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DemandeXRMDTO toDtoDemandeXRMId(DemandeXRM demandeXRM);
}
