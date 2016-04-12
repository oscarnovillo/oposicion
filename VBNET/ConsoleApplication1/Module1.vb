Module Module1

    Sub Main()

        Dim menu As Menu
        menu = New Menu()
        menu.Options.Add(New MenuOption("programa1", "1"))
        Dim op As String = menu.Show()
        Select Case op
            Case "1"
                ejemplo1()
            Case Else
                Console.WriteLine("ADIOS")
        End Select


    End Sub


    Sub ejemplo1()
        Dim vector() As Integer
        Dim longitud As Integer
        Dim i As Integer = 0, j As Integer
        Dim salir As Boolean
        Try
            Console.WriteLine("Introduzca el número de elementos")
            longitud = Console.ReadLine()
        Catch e As Exception
            Console.WriteLine("El error ocurrido es : {0}", e.ToString)

        End Try
        longitud -= 1

        ReDim vector(longitud)
        For i = 0 To longitud
            Do
                Try
                    Console.WriteLine("Introduzca el elemento {0}", i + 1)
                    vector(i) = CType(Console.ReadLine(), Integer)
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

End Module
