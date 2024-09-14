function consultarCEP() {

    const cep = document.getElementById('cep').value;
    const cepLimpo = cep.replace(/\D/g, '');
    const url = "https://viacep.com.br/ws/" + cepLimpo + "/json/";

    if (cepLimpo.length === 8) {
        fetch(url)
            .then(response => response.json())
            .then(data => {
                if (data.erro) {
                    alert('CEP não encontrado!');
                    document.getElementById('end').innerText = "CEP Não Encontrado";
                    document.getElementById('cep').focus();
                }
                else {
                    document.getElementById('logradouro').innerText = "logradouro: " + data.logradouro;
                    document.getElementById('bairro').innerText = "bairro: " + data.bairro;
                    document.getElementById('cidade').innerText = "cidade: " + data.cidade;
                    document.getElementById('uf').innerText = "uf: " + data.uf;
                    document.getElementById('ddd').innerText = "ddd: " + data.ddd;
                    document.getElementById('cep').focus
                }
            })
            .catch(error => {
                alert('Erro ao consultar o CEP.');
                console.error(error);
            })
    }
    else {
        alert('Por favor, insira um CEP válido com 8 dígitos.');
    }

}