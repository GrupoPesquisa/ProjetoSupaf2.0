/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author aluno
 */
public class Usuario {
    private String login;
    private String senhha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenhha() {
        return senhha;
    }

    public void setSenhha(String senhha) {
        this.senhha = senhha;
    }

    public Usuario(String login, String senhha) {
        this.login = login;
        this.senhha = senhha;
    }
}
