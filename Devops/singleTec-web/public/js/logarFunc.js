let form = document.getElementById("form_login_func");
let input_email = document.getElementById("email");
let input_senha = document.getElementById("senha");



form.addEventListener("submit", async (e) => {
    e.preventDefault();
    let resposta = await axios.post("/logarFuncionario", {

        email: input_email.value,
        senha: input_senha.value,

    });
    if (resposta.data == false) {
        alert("Falha ao logar");
        console.log(resposta);
    } else {
        alert("Usuario logado!");
        console.log(resposta);
        // limparCampos(input_empresa, input_cnpj, input_telefone, input_email, input_senha, input_cep, input_numero);
    }
});

function limparCampos(...inputs) {
    for (i = 0; i < inputs.length; i++) {
        inputs[i].value = "";
    }
}