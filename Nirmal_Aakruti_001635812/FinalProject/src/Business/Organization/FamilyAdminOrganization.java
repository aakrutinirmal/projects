/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.FamilyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakrutinirmal
 */
public class FamilyAdminOrganization extends Organization {
    public FamilyAdminOrganization() {
        super(Organization.Type.FamilyAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FamilyAdminRole());
        return roles;
    }
}
