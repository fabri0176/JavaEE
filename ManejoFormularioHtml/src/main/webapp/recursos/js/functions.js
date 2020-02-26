var ManejoFormularioHtml = {
    validarForm: function () {

        let usuario = $("#usuario");
        let password = $("#password");
        let tecnologias = $("input[name='tecnologia']");
        let tecnologiaSeleccionado = false;
        let genero = $("input[name='genero']");
        let generoSeleccionado = false;
        let ocupacion = $("#ocupacion");

        // usuario
        if (usuario.val() == "" || usuario.val() == "Escribir usuario") {
            ManejoFormularioHtml.mostrarAlerta("Debe escribir un usuario");
            ManejoFormularioHtml.ocultarAlerta();
            usuario
                    .focus()
                    .select();

            return false;
        }

        //Password
        if (password.val() == "" || password.val().length < 3) {
            ManejoFormularioHtml.mostrarAlerta("El password debe tener más de 3 caracteres");
            ManejoFormularioHtml.ocultarAlerta();
            password
                    .focus()
                    .select();
            return false;
        }

        //Tecnolgias
        $.each(tecnologias, function (index, input) {
            if ($(input).is(":checked")) {
                tecnologiaSeleccionado = true;
            }
        });

        if (tecnologiaSeleccionado === false) {
            ManejoFormularioHtml.mostrarAlerta("Debe seleccionar una tecnologia");
            ManejoFormularioHtml.ocultarAlerta();
            return false;
        }

        //Genero
        $.each(genero, function (index, input) {
            if ($(input).is(":checked")) {
                generoSeleccionado = true;
            }
        });

        if (generoSeleccionado === false) {
            ManejoFormularioHtml.mostrarAlerta("Debe seleccionar un genero");
            ManejoFormularioHtml.ocultarAlerta();
            return false;
        }


        //Ocupacion
        if (ocupacion.val() == "") {
            ManejoFormularioHtml.mostrarAlerta("Debe seleccionar una ocupación");
            ManejoFormularioHtml.ocultarAlerta();
            ocupacion
                    .focus();
            return false;

        }

        alert("Enviando datos");


        return true;

    },
    ocultarAlerta: function () {
        setTimeout(function () {
            $("#alerta").hide();
            $("#alertaMsg").html("");

        }, 4000);
    },
    mostrarAlerta: function (msg = "") {
        $("#alertaMsg").html(msg)
        $("#alerta").show();
    },
};


