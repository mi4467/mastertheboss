package com.mastertheboss.model;

import java.lang.reflect.Field;

public class BPNRuleEngineInputModel {
    String companyFullNameCurrent;
    String companyRoleCurrent;
    String companyIsClientCurrent;
    String productCurrent;
    String purposeCurrent;
    String companyFullNameCrossChecked;
    String companyRoleCrossChecked;
    String companyIsClientCrossChecked;
    String productCrossChecked;
    String caStatusCrossChecked;
    String dealStatusCrossChecked;
    String colorCode;

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getCompanyFullNameCurrent() {
        return companyFullNameCurrent;
    }

    public void setCompanyFullNameCurrent(String companyFullNameCurrent) {
        this.companyFullNameCurrent = companyFullNameCurrent;
    }

    public String getCompanyRoleCurrent() {
        return companyRoleCurrent;
    }

    public void setCompanyRoleCurrent(String companyRoleCurrent) {
        this.companyRoleCurrent = companyRoleCurrent;
    }

    public String getCompanyIsClientCurrent() {
        return companyIsClientCurrent;
    }

    public void setCompanyIsClientCurrent(String companyIsClientCurrent) {
        this.companyIsClientCurrent = companyIsClientCurrent;
    }

    public String getProductCurrent() {
        return productCurrent;
    }

    public void setProductCurrent(String productCurrent) {
        this.productCurrent = productCurrent;
    }

    public String getPurposeCurrent() {
        return purposeCurrent;
    }

    public void setPurposeCurrent(String purposeCurrent) {
        this.purposeCurrent = purposeCurrent;
    }

    public String getCompanyFullNameCrossChecked() {
        return companyFullNameCrossChecked;
    }

    public void setCompanyFullNameCrossChecked(String companyFullNameCrossChecked) {
        this.companyFullNameCrossChecked = companyFullNameCrossChecked;
    }

    public String getCompanyRoleCrossChecked() {
        return companyRoleCrossChecked;
    }

    public void setCompanyRoleCrossChecked(String companyRoleCrossChecked) {
        this.companyRoleCrossChecked = companyRoleCrossChecked;
    }

    public String getCompanyIsClientCrossChecked() {
        return companyIsClientCrossChecked;
    }

    public void setCompanyIsClientCrossChecked(String companyIsClientCrossChecked) {
        this.companyIsClientCrossChecked = companyIsClientCrossChecked;
    }

    public String getProductCrossChecked() {
        return productCrossChecked;
    }

    public void setProductCrossChecked(String productCrossChecked) {
        this.productCrossChecked = productCrossChecked;
    }

    public String getCaStatusCrossChecked() {
        return caStatusCrossChecked;
    }

    public void setCaStatusCrossChecked(String caStatusCrossChecked) {
        this.caStatusCrossChecked = caStatusCrossChecked;
    }

    public String getDealStatusCrossChecked() {
        return dealStatusCrossChecked;
    }

    public void setDealStatusCrossChecked(String dealStatusCrossChecked) {
        this.dealStatusCrossChecked = dealStatusCrossChecked;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");

        result.append( this.getClass().getName() );
        result.append( " Object {" );
        result.append(newLine);

        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();

        //print field names paired with their values
        for ( Field field : fields  ) {
            result.append("  ");
            try {
                result.append( field.getName() );
                result.append(": ");
                //requires access to private field:
                result.append( field.get(this) );
            } catch ( IllegalAccessException ex ) {
                System.out.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");

        return result.toString();
    }
}
