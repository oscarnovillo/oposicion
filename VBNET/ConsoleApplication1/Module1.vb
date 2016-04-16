Module Module1

    Sub Main()

        Dim menu As Menu
        menu = New Menu()
        menu.Options.Add(New MenuOption("programa1", "1"))
        menu.Options.Add(New MenuOption("programa2", "2"))
        menu.Options.Add(New MenuOption("programa3", "3"))
        menu.Options.Add(New MenuOption("programa4", "4"))
        menu.Options.Add(New MenuOption("programa5", "5"))
        Dim op As String = menu.Show()
        Select Case op
            Case "1"
                ejemplo1()
            Case "2"
                ejemplo2()
            Case "3"
                ejemplo3()
            Case "4"
                ejemplo4()
            Case "5"
                ejemplo5()
            Case Else
                Console.WriteLine("ADIOS")
        End Select


    End Sub


    Sub ejemplo1()
        Dim vector() As Integer
        Dim longitud As Integer
        Dim a As ArrayList

        a = New ArrayList
        Dim i As Integer = 0, j As Integer
        Dim salir As Boolean
        Try
            Console.WriteLine("Introduzca el número de elementos")
            longitud = Console.ReadLine()
        Catch e As Exception
            Console.WriteLine("El error ocurrido{1} es : {0}", e.ToString, "pp")
        End Try
        longitud -= 1

        ReDim vector(longitud)
        For i = 0 To longitud Step 1
            Do
                Try
                    Console.WriteLine("Introduzca el elemento {0}", i + 1)
                    Dim num As Integer
                    num = CType(Console.ReadLine(), Integer)
                    vector(i) = num
                    a.Add(num)

                    salir = True
                Catch e As InvalidCastException
                    salir = False
                    Console.WriteLine("El valor introducido no es un entero")
                Catch e As Exception
                    salir = False
                    Console.WriteLine(e.ToString)
                End Try
            Loop Until salir
        Next
        j = 1
        For Each num As Integer In a
            Console.WriteLine("{0}", num)
        Next

        For i = 0 To vector.Length - 1
            Console.Write("{0}{1}", vector(i).ToString, vbTab)
            If j = 3 Then
                Console.WriteLine()
                j = 0
            End If
            j += 1
        Next
        Console.ReadLine()
    End Sub

    Sub ejemplo2()
        Dim matriz() As Integer, numero As Integer = 1
        Dim acumulado As Integer, elementos As Integer = -1
        Do
            elementos += 1
            Console.WriteLine("Introduzca un número")
            numero = CType(Console.ReadLine(), Integer)
            acumulado += numero
            ReDim Preserve matriz(elementos)
            matriz(elementos) = numero
        Loop Until numero = 0
        Console.WriteLine("La media es {0}", acumulado / elementos)
        Console.WriteLine("La suma de los elementos es {0}", acumulado)
        Console.ReadLine()
    End Sub


    Sub ejemplo3()
        Dim mtr1(), mtr2(), mtr_res(), numero As Single

        Dim i As Integer = -1
        Console.WriteLine("Intoduciendo los valores del primer vector")
        Do
            Console.Write("Introduzca valor {0}:", i + 1)
            numero = CType(Console.ReadLine(), Single)
            If numero <> 0 Then
                i += 1
                ReDim Preserve mtr1(i)
                mtr1(i) = numero
            End If
        Loop Until numero = 0
        i = -1
        Console.WriteLine("Intoduciendo los valores del segundo vector")
        Do
            Console.Write("Introduzca valor {0}:", i + 1)
            numero = CType(Console.ReadLine(), Single)
            If numero <> 0 Then
                i += 1
                ReDim Preserve mtr2(i)
                mtr2(i) = numero
            End If
        Loop Until numero = 0
        ReDim mtr_res(mtr1.Length + mtr2.Length - 1)
        For i = 0 To mtr1.Length - 1
            mtr_res(i) = mtr1(i)
        Next
        For i = 0 To mtr2.Length - 1
            mtr_res(i + mtr1.Length) = mtr2(i)
        Next
        Console.WriteLine("{0}Listado de la matriz resultante", vbCrLf)
        For i = 0 To mtr_res.Length - 1
            Console.Write("{0} {1}", mtr_res(i), vbTab)


            If i Mod 3 = 0 Then
                Console.WriteLine()
            End If
        Next
        Console.ReadLine()
    End Sub

    Enum c
        radio = 0
        perimetro = 1
        area = 2

    End Enum

    Sub ejemplo4()
        Dim fila As c
        Dim radios(), tabla(,), numero As Single
        Dim i As Integer = -1

        Console.WriteLine("Intoduciendo los valores de los radios")
        Do
            Console.Write("Introduzca valor {0}:", i + 1)
            numero = CType(Console.ReadLine(), Single)
            If numero <> 0 Then
                i += 1
                ReDim Preserve radios(i)
                radios(i) = numero
            End If
        Loop Until numero = 0
        ReDim tabla(2, radios.Length - 1)
        For i = 0 To radios.Length - 1
            tabla(c.radio, i) = radios(i)
            tabla(c.perimetro, i) = 2 * tabla(c.radio, i) * Math.PI
            tabla(c.area, i) = tabla(c.radio, i) ^ 2 * Math.PI
        Next
        Console.WriteLine("{0}Radio{1}Perimetro{2}Area", vbCrLf, vbTab, vbTab)
        For i = 0 To radios.Length - 1
            Console.WriteLine("{0}{1}{2}{3}{4}", tabla(c.radio, i), vbTab,
            tabla(c.perimetro, i), vbTab, tabla(c.area, i))
        Next
        Console.WriteLine("{0}{1}Pulse INTRO para finalizar", vbCrLf, vbCrLf)
        Console.ReadLine()
    End Sub


    Sub ejemplo5()

        Dim num1, num2, num3, c As Integer
            Dim menor As Integer = 100
            Console.WriteLine("Introduzca tres numero para saber cual es el menor: ")
            Console.Write("Numero 1:")
            num1 = Console.ReadLine()
            Console.Write("Numero 2:")
            num2 = Console.ReadLine()
            Console.Write("Numero 3:")
            num3 = Console.ReadLine()
            If num1 < num2 Then
                If num1 < num3 Then
                    Console.WriteLine("El mas pequeño: {0}", num1)
                Else
                    Console.WriteLine("El mas pequeño: {0}", num3)
                End If
            Else
                If num2 < num3 Then
                    Console.WriteLine("El mas pequeño: {0}", num2)
                Else
                    Console.WriteLine("El mas pequeño: {0}", num3)
                End If
            End If
            Console.ReadLine()
        End Sub
End Module



